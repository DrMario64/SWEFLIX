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
				document.getElementById('mili').innerHTML += data.dateTimeString;
				document.getElementById('content').innerHTML = data.content;


	})



}