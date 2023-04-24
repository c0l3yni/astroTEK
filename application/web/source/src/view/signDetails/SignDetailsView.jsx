import TitleRegion from "../../region/TitleRegion";
import SignDetailsRegion from "./signDetailsRegion/SignDetailsRegion";
import signsDetails from "../../data/sign.json"
import getUrlParam from "../../urlParam/urlParam.js";

function SignDetailsView() {
	const id = getUrlParam("sign_id");
	const oneSignDetails = signsDetails.find((sign) => sign.id === id)
	return (
		<div id="sign-view">
			<TitleRegion title="Sign" />
			<div id='sign-details-region'>
			<SignDetailsRegion data-sign="id" oneSignDetails={oneSignDetails} />
			</div>
		</div>
	);
}

export default SignDetailsView;
