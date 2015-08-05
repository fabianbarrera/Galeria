
var ultimaImagen = document.getElementById('imagenprincipal').src;

function dobleclick(){
document.getElementById('imagenprincipal').src='./imagenes/imagen2.jpg';	
}


function imagen1() {
ultimaImagen = document.getElementById('imagenprincipal').src;
document.getElementById('imagenprincipal').src='./imagenes/imagen1.jpg';
}


function imagen3() {
ultimaImagen = document.getElementById('imagenprincipal').src;
document.getElementById('imagenprincipal').src='./imagenes/imagen3.jpg';
}


function imagen4() {
ultimaImagen = document.getElementById('imagenprincipal').src;
document.getElementById('imagenprincipal').src='./imagenes/imagen4.jpg';
}


function imagen5() {
ultimaImagen = document.getElementById('imagenprincipal').src;
document.getElementById('imagenprincipal').src='./imagenes/imagen5.jpg';
}

function volver() {
	//var ultimaImagen = document.getElementById('imagenprincipal').src;
	document.getElementById("imagenprincipal").src=ultimaImagen;}


function imagenFija(archivo) {
	var ver = "./imagenes/"+archivo;
	ultimaImagen =document.getElementById('imagenprincipal').src= ver;
}
