'use strict'
var valorFormulario ;
$(function() {
  var $formArtista = $('#formArtista');
  $formArtista.submit(function(e) {
       $('#lista-albums').empty();
      valorFormulario = new FormData($formArtista[0]).get('artista');
      var eOJustin = false;
      if (valorFormulario.toLowerCase() === 'justin bieber'){
          var eOJustin = Math.random() <= 0.2 ? true : false;
      }
      $.get({url: 'https://api.spotify.com/v1/search/',
             data: {q: valorFormulario, type: 'artist',}
      }).then(
             function(obj){ 
                  eOJustin ?  exibirAlbums('douchebag') : exibirAlbums(obj.artists.items[0].id) ;
             });
      return e.preventDefault();
  });
});