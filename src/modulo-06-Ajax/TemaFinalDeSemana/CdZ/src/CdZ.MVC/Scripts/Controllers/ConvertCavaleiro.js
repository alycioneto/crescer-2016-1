'use strict'
function ConvertCavaleiro() { };

ConvertCavaleiro.prototype.toModel = function ($form) {
    var form = new FormData($form[0]);
    var golpes = [];
    $('novosGolpes li').each(
        golpes.push({
            Nome: form.get('golpes'),
        }));
    var imagens = [];
    $('novasImagens li ').each(
        imagens.push({
            UrlImagem: form.get('urlImagem'),
            IsThumb: form.get('isThumb').is(':checked'),
        })
        );
    return caveleiro = {
        Nome: form.get('nome'),
        TipoSanguineo: form.get('tipoSanguineo'),
        DataNascimento: form.get('dataNascimento').toISOString(),
        AlturaCm: form.get('nbAlturaMetros') * 100,
        PesoLb: converteEmLB(form.get('nbPesoKilos')),
        Signo: form.get('signo'),
        LocalNascimento: {
            Texto: form.get('localNascimento')
        },
        LocalTreinamento: {
            Texto: form.get('localTreinamento')
        },
        Golpes: golpes,
        Imagens: imagens,
    }
}
var converteEmLB = function (pesoEmKG) {
    return Math.round(((pesoEmKG * 2.20462)* 100) / 100);
};