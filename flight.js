$(document).ready(function(){
	
	
    $.ajax({
        url: "http://localhost:8080/flightreservation/flight",
        type: "GET",
        success: function(flightlist){
            $("#flights").prepend("<option value='' selected='selected'></option>")            
            $.each(flightlist, function(index,flight){
                $("#flights").append($("<option></option>").attr("value",flight.flightNo).text(flight.destination + " " + flight.departureDate));
            })
        },
        error: function (jqXHR){
            alert("Something went wrong!");
        }
    })
	
    
    $("#flights").on("change",function(){
      
		$("#seats").empty();
       
        var flightId = $("#flights").val();
        var myUrl = ("http://localhost:8080/flightreservation/flight/") + flightId;
        
	    $.ajax({
        url: myUrl,
        type: "GET",
        success: function(flight){
            $.each(flight.seats, function(index,seat){
                if(seat.reserved == false)
				{$("#seats").append($("<option></option>").attr("value",seat.seatId).text(seat.seatNo + " " + seat.category + " " + seat.price + "kr"));}
            })
        },
        error: function (jqXHR){
            alert("Something went wrong!");
        }
    
    }) }) 
    
    $.ajax({
        url: "http://localhost:8080/flightreservation/food",
        type: "GET",
        success: function(foodlist){
            $("#food").prepend("<option value='' selected='selected'></option>") 
            $.each(foodlist, function(index,food){
                $("#food").append($("<option></option>").attr("value",food.foodId).text(food.type + " " + food.price + "kr"));
            })
        },
        error: function (jqXHR){
            alert("Something went wrong!");
        }
    })

    $.ajax({
        url: "http://localhost:8080/flightreservation/passenger",
        type: "GET",
        success: function(passengerlist){
             $("#passengers").prepend("<option value='' selected='selected'></option>") 
            $.each(passengerlist, function(index,passenger){
                $("#passengers").append($("<option></option>").attr("value",passenger.passengerId).text(passenger.name));
            })
        },
        error: function (jqXHR){
            alert("Something went wrong!");
        }
    })


         $("#buttonSubmitReservation").click(function(){
		
             
			var passenger = { passengerId : $("#passengers").val()};
			var flight = { flightNo : $("#flights").val()};
			var seat = { seatId : $("#seats").val()};
			var food = { foodId : $("#food").val()};
			
			var reservation = { passenger:passenger, flight:flight, seat:seat, food:food };

			$.ajax({
				type: "POST",
				contentType: "application/json",
				url:"http://localhost:8080/flightreservation/reservation",
				data: JSON.stringify(reservation),
				success: function(reservation){
					alert("Your flight is booked!");
                    $("#reservation").append(reservation);
					//$("#reservation").text(reservation);
				},
				 error: function (jqXHR){
					alert("Something went wrong!");
					}
					})
		})


		    $.ajax({
        url: "http://localhost:8080/flightreservation/flightdetails",
        type: "GET",
        success: function(flightDetails){
         
          
         
        },
        error: function (jqXHR){
            alert("Something went wrong!");
        }
    })
		
		
});

