import React, { useState } from "react";
import { useNavigate } from "react-router-dom";
import users from "../../data/users.json"

function LoginRegion() {
	const [username, setUsername] = useState("");
	const [password, setPassword] = useState("");
	const foundUsername = users.map((user) => user.username);
	console.log(foundUsername)
	console.log(username)
	const foundPassword = users.map((user) => user.password);
	const navigate = useNavigate();
	const handleUsernameChange = event => {
		setUsername(event.target.value);
	}
	const handlePasswordChange = event => {
		setPassword(event.target.value);
	}

	function navToMember() {
		navigate("/member-landing");
	}

	function isUserValid() {
		if (foundUsername[0] === username && foundPassword[0] === password) {
			return "";
		} else {
			return "Invalid username or password.";
		}
	}  

	function donav() {
		return isUserValid() ? "" : navToMember() 
	}
	
	return (		
		<form id="login-region">
			<div id="row" disabled>
				<span >Username: </span>
				<input 
				placeholder="username" 
				id="username" 
				type="text" 
				value={username}
				onChange={handleUsernameChange}></input>
			</div>
			<div id="row" >
				<span>Password: </span>
				<input 
				placeholder="password" 
				id="password" 
				type="password" 
				value={password}
				onChange={handlePasswordChange}></input>
			</div>
			<div id="bad-credentials">{isUserValid()}</div>
			<button id="submit-button" type="button"onClick={donav}>Login</button>
		</form>
	);
}

export default LoginRegion;
