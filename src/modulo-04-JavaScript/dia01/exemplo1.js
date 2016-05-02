console.log('Outro Script');
console.log(hello);
typeof(hello);
function somar(a,b) { return a + b};
var sub = function(a,b,fn){return fn(a - b)};
var funcoes = [somar(1,1),sub];
funcoes[1](3,2,function(res){
    console.log('O resultado é: ' , res);
});
