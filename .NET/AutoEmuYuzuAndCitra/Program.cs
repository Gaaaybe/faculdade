using System;
using System.Diagnostics;
using System.Threading;

class Program
{
    static void Main()
    {
        string yuzuPath = @"C:\Users\Gabriel\Programas\Emuladores\Switch\yuzu-windows-msvc\yuzu.exe";
        string citraPath = @"C:\Users\Gabriel\Programas\Emuladores\Citra (3ds)\citra-qt.exe";
        string keysticksPath = @"C:\Users\Gabriel\Programas\Emuladores\Dolphin (WiiGC)\Dolphin.exe";

        bool yuzuRunning = false;
        bool citraRunning = false;
        bool keysticksRunning = false;

        while (true)
        {
            bool yuzuRunningNow = ProcessIsRunning(yuzuPath);
            bool citraRunningNow = ProcessIsRunning(citraPath);

            if (yuzuRunningNow != yuzuRunning || citraRunningNow != citraRunning)
            {
                yuzuRunning = yuzuRunningNow;
                citraRunning = citraRunningNow;

                if (yuzuRunning || citraRunning)
                {
                    if (!keysticksRunning)
                    {
                        AbrirPrograma(keysticksPath);
                        keysticksRunning = true;
                    }
                }
                else
                {
                    if (keysticksRunning)
                    {
                        FecharPrograma(keysticksPath);
                        keysticksRunning = false;
                    }
                }
            }

            Thread.Sleep(1000);
        }
    }

    static bool ProcessIsRunning(string processPath)
    {
        string processName = System.IO.Path.GetFileNameWithoutExtension(processPath);
        return Process.GetProcessesByName(processName).Length > 0;
    }

    static void AbrirPrograma(string caminhoPrograma)
    {
        Process.Start(caminhoPrograma);
    }

    static void FecharPrograma(string caminhoPrograma)
    {
        string nomeProcesso = System.IO.Path.GetFileNameWithoutExtension(caminhoPrograma);

        foreach (var processo in Process.GetProcessesByName(nomeProcesso))
        {
            processo.Kill();
        }
    }
}