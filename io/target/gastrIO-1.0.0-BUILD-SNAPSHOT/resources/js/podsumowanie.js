function back() {
	window.location = "/rejestracja/strona3";
}
function success() {
	alert('Great success!');
}

function destroyClickedElement(event) {
	document.body.removeChild(event.target);
}

$(document).ready(function () {

	$('#podsumowanie').bootstrapValidator({
		submitHandler: function (validator, form, submitButton) {
		}
	});
});