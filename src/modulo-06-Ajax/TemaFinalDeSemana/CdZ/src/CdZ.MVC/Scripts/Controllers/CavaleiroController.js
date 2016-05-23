'use strict'
var $formulario = $('#frmNovoCavaleiro');
$(function () {
    $formulario.submit(function () {
        var cavaleiro = new ConvertCavaleiro().toModel($formulario);
        cavaleiroIndexView.InserirCavaleiroNoServidor({ self: cavaleiroIndexView, Cavaleiro: cavaleiro });
    });
});

