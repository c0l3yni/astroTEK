import React from "react";

function SignRegion({ sign }) {
	return (
		<div className="sign-region" data-sign={sign.id}>
			{sign.name}
		</div>
	);
}

export default SignRegion;
