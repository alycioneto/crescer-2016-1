
var daisyGame = function(flores){
    return flores%2 === 0 ? "Love Me" : "Love Me Not";
}

var maiorTexto = function(array){
  var maiorPalavra='';
  for( var i=0; i < array.length; i++ ){
    var palavraAtual = array[i];
    if (palavraAtual.length > maiorPalavra.length)
      maiorPalavra = palavraAtual;
  }
  return maiorPalavra;
}

var imprime = function(instrutores, fn){
    if (typeof fn === 'function'){
      for(var i = 0; i< instrutores.length; i++){
        fn(instrutores[i]);
      }
    }
}
var imprimeInstrutores =  function(instrutor) {
     console.log('olá querido instrutor: ' + instrutor)
}
//http://stackoverflow.com/questions/18802026/function-calling-in-javascript-with-double-brackets
var somar = function(primeiroValor){
    return function(segundoValor){
      return primeiroValor+segundoValor;
    }
}
var fiboSum = function(tamanho) {
  var sequencia= [];
  var  i = 0;
  var  j = 1;
  var soma = 0;
  sequencia.push(i);
  sequencia.push(j);
  while (sequencia.length <= tamanho) {
    sequencia.push(sequencia[j] + sequencia[i]);
    soma += sequencia[j];
    j++;
    i++;
  }
  return soma + sequencia[j];
};

//http://www.w3schools.com/jsref/jsref_sort.asp
var queroCafe = function(mascada, precos){
    precos.sort(function(a, b){return a-b});
    for (var i = precos.length -1; mascada < precos[i]; i--) {
        precos.pop();
    }
    return precos;
}

var contarPorTipo = function(objeto, string){
    var cont=0;
    for(var i in objeto){
      if (typeof objeto[i] === string ){
        cont++;
      }
      else if (string == "null") {
        objeto[i] == string
      }
      else if(string == "array")
      objeto[i] instanceof Array ? cont++:cont;
   }
   return cont;
}

// No momento que dentro da function, a variavel gohan é novamente declarada com var, ela volta a ser undefined, perdendo valor que já sido informado;
var gohan = 'gohan', goku = 'Goku';
function revelarSaiyaman() {
  console.log(gohan);
  goku = 'Son Goku';
  var gohan = 'Son ' + gohan;
  return gohan;
}
console.log(revelarSaiyaman());
console.log(goku);
