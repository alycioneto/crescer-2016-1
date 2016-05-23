'use strict'

$(function () {
    $('#btnAdicionarGolpe').click(function () {
        $('#novosGolpes').append(gerarElementoLiComInputTexto());
    });
    $('#btnAdicionarImg').click(function () {
        var $novoLi = gerarElementoLiComInputs();
        $('#novasImagens').append($novoLi);
    });

});
function gerarElementoLiComInputs() {
    var $novoTxt = $('<input>').attr('name', 'urlImagem').attr('type', 'text').attr('placeholder', 'Ex: bit.ly/shiryu.png');
    var $novoCheckbox =
      $('<label>').append(
        $('<input>')
        .attr('type', 'checkbox')
        .attr('name', 'isThumb')
        .attr('checked', 'checked')
      ).append('É thumbnail?');
    return $('<li>').append($novoTxt).append($novoCheckbox);
};
function gerarElementoLiComInputTexto() {
    var $novoTxt = $('<input>').attr('name', 'golpe').attr('type', 'text').attr('placeholder', 'Ex: Pó de diamante');
    return $('<li>').append($novoTxt);
};