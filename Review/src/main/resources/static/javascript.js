function MovieTitle() {
	var m = document.get
}


function test() {

	var d = Date.now()
	console.log(d);

	fetch('http://localhost:8080/grab/Avengers/Alice')
	.then(response => response.json())
	.then(data => {

		document.getElementById('mili').innerHTML = data.dateTimeString;
		document.getElementById('content').innerHTML = data.content;

	});


}


function manip() {



	var f = document.getElementById('review').value
	console.log(f)

	fetch("http://localhost:8080/data/1/" + f + "/5/" + Date.now() + "/700/Spiderman/David")
	.then(response => response.text())
	.then(data => {

			//this is already  written in the java code, but I had to rewrate in javascript

			var foo = document.getElementById('review').value
			var today = new Date();
			var date = today.getDate()+'-'+(today.getMonth()+1)+'-'+today.getFullYear();
			var time = today.getHours() + ":" + today.getMinutes() + ":" + today.getSeconds();
			var dateTime = date+' '+time;


				//document.getElementById('mili').innerHTML += data.dateTimeString;

				document.getElementById('mili').innerHTML = dateTime;

				document.getElementById('content').innerHTML = foo;

				//document.getElementById('content').innerHTML = data.content


	})



}