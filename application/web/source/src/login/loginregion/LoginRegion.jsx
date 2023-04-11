import React from "react";
import { useNavigate } from "react-router-dom";
import users from "../../data/users.json"

function LoginRegion() {
	const testUsername = new URLSearchParams(window.location.search).get("username");
	const testPassword = new URLSearchParams(window.location.search).get("password");
	let dataUsername = users.map((user) => user.username);
	let dataPassword = users.map((user) => user.password);
	const navigate = useNavigate();

	function navToMember() {
		navigate("/member-landing");
	}

	function badMsg() {
		if(document.getElementById("username").innerHTML === null || !document.getElementById("password").innerText === null){
			return "" 
		} else {
			"Incorrect credentials provided";
		}
	}
	
	function doCredsMatch() {	
		if(testUsername == dataUsername && testPassword == dataPassword) {
			return navToMember();
		} else {
			return badMsg();
		}
	}
	
	return (		
		<form id="login-region">
			<div id="row" disabled>
				<span >Username: </span><input placeholder="username" id="username" type="text"></input>
			</div>
			<div id="row" >
				<span>Password: </span><input placeholder="password" id="password" type="password"></input>
			</div>
			<div id="bad-credentials">{badMsg()}</div>
			<button id="submit-button" type="button" onClick={doCredsMatch}>Login</button>
		</form>
	);
}

export default LoginRegion;
