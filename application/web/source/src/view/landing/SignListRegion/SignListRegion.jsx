import React from "react";
import signList from "../../../data/sign.json";
import SignRegion from "./SignRegion/SignRegion";

function SignListRegion() {
	function renderSignRegions() {
		return signList.map((sign) => {
			return <SignRegion sign={sign} key={sign.id} />;
		});
	}
	return <div id="sign-list-region">{renderSignRegions()}</div>;
}

export default SignListRegion;
