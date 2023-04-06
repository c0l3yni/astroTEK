import React from "react";
import { useNavigate } from "react-router-dom";
import users from "../../data/users.json"
import { useState } from "react";

function LoginRegion() {
	const [badMsg, setBadMsg] = useState("");

	const navigate = useNavigate();
	const urlParams = new URLSearchParams(location.search);	
	let user = users.map((user) => {
		return user.username && user.password;
	})

for (const [key, value] of urlParams) {
    console.log(`${key}:${value}`);
}

function navToMemberLanding() {
		navigate("/member-landing");
	}

function doCredentialsMatch(user) {
	if(urlParams.key ==="username" && user.username === urlParams.value) {
			if(urlParams.key === "password" && user.password === urlParams.value) {
					return true;
				}
			}
		}


function whatToDo(user) {
	if(doCredentialsMatch(user) === true) {
		return navToMemberLanding();
	} else {
		setBadMsg("Incorrect credentials provided");
	}
}

	return (		
		<form id="login-region">
			<div id="row" disabled>
				<span id="username">Username: </span><input placeholder="username" type="text"></input>
			</div>
			<div id="row" >
				<span id="password">Password: </span><input placeholder="password" type="password"></input>
			</div>
			<div id="bad-credentials">{badMsg}</div>
			<button id="submit-button" type="button" onClick={whatToDo}>Login</button>
		</form>
	);
}

export default LoginRegion;
