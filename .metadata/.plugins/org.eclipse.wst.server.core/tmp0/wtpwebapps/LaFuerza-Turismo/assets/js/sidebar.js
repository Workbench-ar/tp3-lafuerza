function openNav() {
	document.getElementById("mySidebar").style.width = "250px";
	document.getElementById("main").style.marginLeft = "250px";
	document.getElementById("main").style.opacity = "0.2";

}

function closeNav() {
	document.getElementById("main").style.opacity = "1";
	document.getElementById("mySidebar").style.width = "0";
	document.getElementById("main").style.marginLeft = "0";
}
