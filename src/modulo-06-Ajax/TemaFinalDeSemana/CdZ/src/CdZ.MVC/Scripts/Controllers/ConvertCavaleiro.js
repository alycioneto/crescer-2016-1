'use strict'
function ConvertCavaleiro() { };

ConvertCavaleiro.prototype.toModel = function ($form) {
    var form = new FormData($form[0]);
    var golpes = $("input[name='golpe']").map(function () { return $(this).val(); }).get();
   // $('novosGolpes li').each(
     //   golpes.push({
       //     Nome: form.get('golpes'),
        //}));
    var imagens = $("#novasImagens li").map(function () { return { url: $(this).find("input[name='urlImagem']").val(), isThumb: $(this).find("input[name='isThumb']").is(":checked") } }).get();
        //imagens.push({
          //  UrlImagem: form.get('urlImagem'),
            //IsThumb: form.get('isThumb').is(':checked'),
        //})
    //);

    var data = $('#txtDtNascimento').datepicker('getDate');
    var altura = converteEmMetros(form.get('alturaMetros'));
    var peso = converteEmLB(form.get('pesoKg'));
    return {
        Nome: form.get('nome'),
        TipoSanguineo: form.get('tipoSanguineo'),
        DataNascimento: new data.toISOString(),
        AlturaCm: altura,
        PesoLb:peso ,
        Signo: form.get('signo'),
        LocalNascimento: {
            Texto: form.get('localNascimento')
        },
        LocalTreinamento: {
            Texto: form.get('localTreinamento')
        },
        Golpes: golpes,
        Imagens: imagens,
    };
}
var converteEmLB = function (pesoEmKG) {
    return Math.round(((parseInt(pesoEmKG) * 2.20462)* 100) / 100);
};
var converteEmMetros = function (alturaEmMetros) {
    return parseInt(alturaEmMetros)* 100;
};