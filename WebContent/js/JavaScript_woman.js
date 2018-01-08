//Listen for form submit
document.getElementById('myForm').addEventListener('submit',saveData);

//save Information
function saveData(e) {
	//Get form values
	var userName =document.getElementById('userName').value;
	var email =document.getElementById('email').value;
	var message =document.getElementById('message').value;

	if(!formValidate(userName,email,message))
	{
		return true;
	}

	var detail={
		name: userName,
		emailId: email,
		messages: message
	}

	//Test if No details 
	if(localStorage.getItem(details)===null)
	{
		//Init array
		var details=[];
		//Add to array
		details.push(detail);

		//set to Local Storage
		localStorage.setItem('details',JSON.stringify(details));
	}
	else
	{
		//Get details from storage
		var details = JSON.parse(localStorage.getItem('details'));

		//Add detail to array
		details.push(detail);

		//Re-set back to local storage
		localStorage.setItem('details',JSON.stringify(details));
	}

	console.log(details);


	//prevent form from submitting
	e.preventDefault();
}

// form Validation
function formValidate(userName,email,message) {

	// checking empty field
	if(!userName|| !email|| !message)
	{
		alert('Please fill all the fields');
		return false;
	}

	var expession= /^\w+[\+\.\w-]*@([\w-]+\.)*\w+[\w-]*\.([a-z]{2,4}|\d+)$/i;
	var regex= new RegExp(expession);

	// checking email expession
	if(!email.match(regex))
	{
		alert('Please fill a valid email id');
		return false;
	}


	return true;
}