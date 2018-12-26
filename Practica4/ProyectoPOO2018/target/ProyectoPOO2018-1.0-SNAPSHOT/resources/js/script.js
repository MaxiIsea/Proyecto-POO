windows.alert("Bienvenido");
function validar_login(form){
	 //var email = form[form.id + ":Username"].value;
	 //var pass = form[form.id + ":pass"].value;
         
         var email = form.txtMail.value;
         var pass = form.txtMail.value;
         
         
	 if(email === "") {
		 alert("Email is blank!");
		 return false;
	 }
	 if(pass === "") {
		 alert("Password is blank!");
		 return false;
	 }
	 return true;
}