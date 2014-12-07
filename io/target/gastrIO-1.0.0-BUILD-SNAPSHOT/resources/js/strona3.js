$(document).ready(function () {


    // blokowanie domyslne wszystkich wartosci i ustawianie domyslnej
    firstRun();

    $('input[name="typeOfTransport"]').click(function () {
        if ($(this).val() === "airplane") {
            // odznaczanie checkboxow i blokowanie ich do przeciwnej wartosci

            resetValues();
            setAirplaneType();
        } else {
            // odznaczanie checkboxow i blokowanie ich do przeciwnej wartosci
            resetValues();
            setTrainType();
        }



    });


	$("#btnClear").click(function(){
        window.location.href="/rejestracja/strona2";
    });

    $('#btnGo').click(function () {


    	if ($('#radio2').is(':checked') && $('#select_class').val()  == 0) {
			alert("Wybierz klase");
		}



        // nazwy zmiennych ktore sa przekazywane do webStorage
		/*	var typeOfTransport;
			var luggage = 0;
			var food = 0;
			var window = 0;
			var typeOfClass = 0;
			var change = 0;
			var bike = 0;



			if ($('#radio1').is(':checked')) {
				// sprawdzenie ktory checkboxy sa zaznaczone dla samolotu
				typeOfTransport = "Lotniczy";
				if ($('#check_luggage').is(':checked')) {
					luggage = 1;
				}
				if ($('#check_food').is(':checked')) {
					food = 1;
				}
				if ($('#check_window').is(':checked')) {
					window = 1;
				}

			} else if ($('#radio2').is(':checked')) {
				// sprawdzenie ktore checkboxy sa zaznaczone dla pociagu
				if ( $('#select_class').val()  >= 0){

				typeOfTransport = "Pociag";
				typeOfClass = $('#select_class').val();
				if ($('#check_change').is(':checked')) {
					change = 1;
				}
				if ($('#check_bike').is(':checked')) {
					bike = 1;
				}
				}else{
					alert("Wybierz klase")
				}
			}*/


/*
			// zapis do webStorage HTMLowego
			sessionStorage.setItem('typeOfTransport', typeOfTransport);
			sessionStorage.setItem('luggage', luggage);
			sessionStorage.setItem('food', food);
			sessionStorage.setItem('window', window);
			sessionStorage.setItem('typeOfClass', typeOfClass);
			sessionStorage.setItem('change', change);
			sessionStorage.setItem('bike', bike);

			//redirect();
*/

    });

    $('#btnClear').click(function () {
        // czyszczenie WebStorage HTMLowego
      //  clearWebStorageTransport();
        //window.location = "strona2.html";

    });

    function redirect() {


        window.location = "podsumowanie.html";

    }


    function reset() {

        $('input:checkbox').prop('disabled', true);
        $('#select_class').prop('disabled', true);

    }

    function resetValues() {
        $('input:checkbox').prop('checked', false);

    }

    function setAirplaneType() {
    	$('#select_class').val('0');
        $('#check_luggage').prop('disabled', false);
        $('#check_food').prop('disabled', false);
        $('#check_window').prop('disabled', false);
        $('#select_class').prop('disabled', true);
        $('#check_change').prop('disabled', true);
        $('#check_bike').prop('disabled', true);


    }

    function setTrainType() {

        $('#check_luggage').prop('disabled', true);
        $('#check_food').prop('disabled', true);
        $('#check_window').prop('disabled', true);
        $('#select_class').prop('disabled', false);
        $('#check_change').prop('disabled', false);
        $('#check_bike').prop('disabled', false);

    }

    function firstRun() {

    	if ($('#radio1').is(':checked')) {
    		setAirplaneType();

		} else if ($('#radio2').is(':checked')) {
			setTrainType();
		}else{
			setAirplaneType();
		}
/*
        if (sessionStorage.getItem('typeOfTransport') === 'Lotniczy') {
			//dodane
			setAirplaneType();
            $('#radio1').prop('checked', true);
            if (sessionStorage.getItem('luggage') === '1') {
                $('#check_luggage').prop('checked', true);
            }
            if (sessionStorage.getItem('food') === '1') {
                $('#check_food').prop('checked', true);
            }

            if (sessionStorage.getItem('window') === '1') {
                $('#check_window').prop('checked', true);
            }



        } else if (sessionStorage.getItem('typeOfTransport') === 'Pociag') {
			//dodane
			setTrainType();
            $('#radio2').prop('checked', true);
            $('#select_class').val(sessionStorage.getItem('typeOfClass'));
            if (sessionStorage.getItem('change') === '1') {
                $('#check_change').prop('checked', true);
            }
            if (sessionStorage.getItem('bike') === '1') {
                $('#check_bike').prop('checked', true);
            }



        } else {
			// else dodany
        	//alert(sessionStorage.getItem('typeOfTransport'));



		}*/
    }

   /* function clearWebStorageTransport() {

        sessionStorage.removeItem('luggage');
        sessionStorage.removeItem('food');
        sessionStorage.removeItem('window');
        sessionStorage.removeItem('typeOfClass');
        sessionStorage.removeItem('change');
        sessionStorage.removeItem('bike');
        sessionStorage.removeItem("typeOfTransport");


    }*/

});