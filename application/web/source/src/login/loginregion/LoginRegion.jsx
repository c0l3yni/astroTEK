import React from "react";
import { useNavigate } from "react-router-dom";

function LoginRegion() {
	const navigate = useNavigate();

	function navToMemberLanding() {
		navigate("/member-landing");
	}

	const urlParams = new URLSearchParams(location.search);

for (const [key, value] of urlParams) {
    console.log(`${key}:${value}`);
}

	return (		
		<form id="login-region">
			<div id="row" disabled>
				<span id="username">Username: </span><input placeholder="username" type="text"></input>
			</div>
			<div id="row" >
				<span id="password">Password: </span><input placeholder="password" type="password"></input>
			</div>
			<button id="submit-button" type="button" onClick={navToMemberLanding}>Login</button>
		</form>
	);
}

export default LoginRegion;
