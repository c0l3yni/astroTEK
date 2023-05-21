import React from "react";
import { useNavigate } from "react-router-dom";

function SignRegion({ sign }) {
	const navigate = useNavigate();

	function navToSign() {
		navigate(`/sign-details?sign_id=${sign.id}`);
	}

	return (
		<p className="sign-region" data-sign={sign.id} onClick={navToSign}>
			{sign.name}
		</p>
	);
}

export default SignRegion;
