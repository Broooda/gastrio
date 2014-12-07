function tryReset() {
	   $.ajax({
	        type : 'POST',
	        url : "reset",
	   });
	  // location.reload();
	   $('input[name="sname"]').val('');
	   $('input[name="fname"]').val('');
	   $('input[name="lname"]').val('');
	   $('input[name="gender"]').prop('checked', false);



}

function duzaLitera(tekst) {
	var txt = document.getElementById(tekst).value;
	if (txt.length == 1) {

		document.getElementById(tekst).value = txt.toUpperCase();
	}
}

function validate(){
//$("#button").click(function() {


	$('#rejestracja').bootstrapValidator({
		fields : {
			fname : {
				validators : {
					notEmpty : {
						message : 'To pole jest wymagane'
					},
					stringLength : {
						max : 30,
						message : 'Maksymalna liczba znaków to 30'
					},
					regexp : {
						regexp : /[a-ząćęóźńłżś]+$/,
						message : '"Pole może zawierać jedynie litery'
					}

				}
			},
			sname : {
				validators : {
					stringLength : {
						max : 30,
						message : 'Maksymalna liczba znaków to 30'
					},
					regexp : {
						regexp : /[a-ząćęóźńł]+$/,
						message : '"Pole może zawierać jedynie litery'
					}
				}
			},
			lname : {
				validators : {
					notEmpty : {
						message : 'To pole jest wymagane'
					},
					stringLength : {
						max : 30,
						message : 'Maksymalna liczba znaków to 30'
					},
					regexp : {
						regexp : /[a-ząćęóźńłś]+$/,
						message : '"Pole może zawierać jedynie litery'
					}
				}
			},
			gender : {
				validators : {
					notEmpty : {
						message : 'Nie wybrano plci'
					}
				}
			},
		},

	});
}
//});