const bubbleSort_crescente5k = require("./src/atividade02/results/BubbleSort_Crescente5k.json");

function calcularMedia(data) {
  let soma = 0;

  data.forEach((numero) => {
    soma += numero;
  });

  const media = soma / data.length;
  return media;
}

console.log("Médias")
console.log("bubbleSort_crescente5k:", calcularMedia(bubbleSort_crescente5k));
//eu te amo
// também te amo
// trabalha gabriel