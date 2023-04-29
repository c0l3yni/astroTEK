import TitleRegion from "../../region/TitleRegion";
import SignDetailsRegion from "./signDetailsRegion/SignDetailsRegion";
import signsDetails from "../../data/sign.json";
import getUrlParam from "../../urlParam/urlParam.js";

function SignDetailsView() {
	const id = getUrlParam("sign_id");
	const sign = signsDetails.find((sign) => sign.id === id);
	return (
		<div id="sign-view">
			<TitleRegion title="Sign" />
			<SignDetailsRegion data-sign="id" sign={sign} />
		</div>
	);
}

export default SignDetailsView;
