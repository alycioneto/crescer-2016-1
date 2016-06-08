'use strict'
var $adicinarAlbuns = function(url){
     $('#lista-albums').append($('<li>').append($('<img>').attr('src', url).addClass('albuns')));
};
var exibirAlbums = function (id){
    var url = 'https://api.spotify.com/v1/artists/' + (id ? id : '6mdiAmATAx73kdxrNrnlao') + '/albums?limit=50';
    $.get(url).then(function(res){
            res.items.forEach(
                    function(album){
                        $adicinarAlbuns(album.images[1].url);
                    })
            ;},function(res){
                var criarSpanComErro = function (status, statusText) {
                    return $('<span>').text('Caro usuário, devido a um erro ' + status + " " + statusText + ' ,não foi possível pesquisar por '+ valorFormulario).addClass('alert alert-danger');
                };
             $('#lista-albums')
             .append(criarSpanComErro(res.status, res.statusText));
           }
    )
};
