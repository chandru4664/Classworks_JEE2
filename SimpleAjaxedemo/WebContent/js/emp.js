/**
 * 
 */

$(document).ready(function(){
	
	$('#empno').blur(function(){
		
		var empno = $('#empno').val();
		if(empno != "") {
			$('#empnomsg').html("");
			var dataa = "empno=" + empno;
			var url = "Search";
			
			$.ajax({
				type:"POST",
				url:url,
				data: dataa,
				dataType: "json",
				success: function(output) {
							
						$('#empnomsg').html("");
						 
						 
					    $('#empname').val(output.empname);
						$('#salary').val(output.salary);
						$('#job').val(output.job);
				},
				error:function(req, status, error) {
					console.log(status, error );
				}
			});
		}
		else{
			$('#empnomsg').html("Empno is mandatory");
		}
	});
});
