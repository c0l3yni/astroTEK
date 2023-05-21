import HeadingRegion from "../../region/HeadingRegion";
import SignDetailsRegion from "./signDetailsRegion/SignDetailsRegion";
import getUrlParam from "../../urlParam/urlParam.js";
import signsDetails from "../../data/sign.json";

function SignDetailsView() {
	const id = getUrlParam("sign_id");
	const sign = signsDetails.find((sign) => sign.id === id);
	return (
		<div id="sign-view">
			<HeadingRegion heading="Sign" />
			<SignDetailsRegion data-sign="id" sign={sign} />
		</div>
	);
}

export default SignDetailsView;
