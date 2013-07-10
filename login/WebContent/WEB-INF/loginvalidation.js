function loginvalidation(form)  
 {
     var returnValue=true;
     var x=login.Firstname.value;
    if(x==null || x=="")
    {
    	alert("First name must be filled out");
    	returnValue= false;
        login.Firstname.value = "";
        login.Firstname.focus();
        return returnValue;
     }
    var y=login.Lastname.value;
    if(y==null || y=="")
    {
    	alert("First name must be filled out");
    	returnValue= false;
        login.Lastname.value = "";
        login.Lastname.focus();
        return returnValue;
     }
    var u=login.Uname.value;
    if(u==null || u=="")
    {
    	alert("First name must be filled out");
    	returnValue= false;
        login.Uname.value = "";
        login.Uname.focus();
        return returnValue;
     }
    if (login.pswd1.value.length < 6)
       {
          returnValue = false;
       alert("Your password must be at least\n6 characters long Please try again.");
            login.pswd1.value = "";
            login.pswd2.value = "";
            login.pswd1.focus();
             return returnValue;
       }                  
    if(login.pswd1.value != login.pswd2.value)
       {
        returnValue = false;
        alert("Your password entries did not match.\nPlease try again.");
          login.pswd1.value = "";
          login.pswd2.value = "";
          login.pswd1.focus();
           return returnValue;
       }
    var k=login.DAY.value;
    if(k==null || k=="")
    {
    	alert("DAY must be filled out");
    	returnValue= false;
        login.DAY.value = "";
        login.DAY.focus();
        return returnValue;
     }
    var z=login.phonenumber.value;
    if(z==null || z=="")
    {
    	alert("phone number  must be filled out");
    	returnValue= false;
        login.phonenumber.value = "";
        login.phonenumber.focus();
        return returnValue;
     }
     
 }