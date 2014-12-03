$(document).ready(function() {

var xmlPath='resources/xml/wojewodztwa.xml';
	/*$.ajax({
			type: "GET",
			url: xmlPath,
			async: false,
			dataType: "xml",
			success: function(xml) {
				$(xml).find('wojewodztwo').each(function(){
					$("#region").append($('<option />', {
						value: $(this).attr('nazwa'),
						text: $(this).attr('nazwa')
					}));
				});
			}
		}); */

		loadData();

	$('#next').click(function() {
		var kodBledu = checkDate();
		var pelnadata =document.forms.rejestracja.day.value+'-'+document.forms.rejestracja.month.value+'-'+document.forms.rejestracja.year.value;
/*
        sessionStorage.setItem(
				'data',
				pelnadata
			);

		sessionStorage.setItem(
				'wojewodztwo',
				document.forms.rejestracja.region.value
			);
		sessionStorage.setItem('dzien', document.forms.rejestracja.day.value);
		sessionStorage.setItem('miesiac', document.forms.rejestracja.month.value);
		sessionStorage.setItem('rok', document.forms.rejestracja.year.value);

*/
		if(kodBledu == 1) {
			return;

		}

		else if (kodBledu == 2) {
			alert('Wprowadzony dzien jest nieprawidłowy!');
		}
		else if (kodBledu == 3) {
			alert('Wprowadzony miesiac jest nieprawidłowy!');
		}
		else if (kodBledu == 4) {
			alert('Wprowadzony rok jest nieprawidłowy!');
		}
		else if (kodBledu == 5) {
			alert('Rok musi być większy lub równy 1900!');
		}
		else if (kodBledu == 6)
			alert('Nie wybrałeś województwa');
		else {
			alert('Taka data nie istnieje!');
		}
	});

	function validateAll() {
		if (checkDate() == 2 || checkDate() == 3 || checkDate() == 4) { return; }
		if (!checkDate()) { setError('#day'); setError('#month'); setError('#year'); }
		else { setOK('#day'); setOK('#month');setOK('#year'); }
	}
	function setOK(field) {
		$(field).removeClass("has-error").addClass("has-success");
		$(field+'Icon').removeClass("glyphicon-remove").addClass("glyphicon-ok");
	}
	function setError(field) {
		$(field).removeClass("has-success").addClass("has-error");
		$(field+'Icon').removeClass("glyphicon-ok").addClass("glyphicon-remove");
	}

	$('[name=day]').on('input', function() {
		var input=$(this);
		var value=parseInt(input.val());
		if(value>0 && value<=31 && input.val().length == 2){ setOK('#day'); validateAll();}
		else{ setError('#day');	}
	});

	$('[name=month]').on('input', function() {
		var input=$(this);
		var value=parseInt(input.val());
		if(value>0 && value<=12 && input.val().length == 2){ setOK('#month');	validateAll();}
		else{ setError('#month'); }
	});

	$('[name=year]').on('input', function() {
		var input=$(this);
		var value=parseInt(input.val());
		if(value>1899){ setOK('#year'); validateAll();}
		else{ setError('#year'); }
	});

	$("#back").click(function(){
        window.location.href="/rejestracja/";
    });


});
function loadData() {
/*
	if(sessionStorage.getItem("data") === "") {
		return;
	}
	$('[name=day]').val(sessionStorage.getItem('dzien'));
	$('[name=month]').val(sessionStorage.getItem('miesiac'));
	$('[name=year]').val(sessionStorage.getItem('rok'));
	var reg = sessionStorage.getItem('wojewodztwo');
	if(reg == null) {
		$('#region').val("0");
	}
	else {
		$('#region').val(sessionStorage.getItem('wojewodztwo'));
	}
*/
}

function checkDate() {
	var day = $('[name=day]').val(), month = $('[name=month]').val(), year = $('[name=year]').val();


	if(day.length != 2) {
		return 2;
	}
	else if(month.length != 2) {
		return 3;
	}
	else if(year.length != 4) {
		return 4;
	}
	else if(year < 1900) {
		return 5;
	}

	var date = day + '/' + month + '/' + year;
	var m = new moment(date, 'DD/MM/YYYY', true);
	if (!m.isValid()) {
           return 0;
	}
	if($('#region').val()==0){
		return 6;
	}
	return 1;

}