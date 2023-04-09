import TitleRegion from "../../region/TitleRegion";
import getUrlParam from "../../urlParam/urlParam.js";

function SignDetailsView() {
	const id = getUrlParam("sign_id");
	return (
		<div id="sign-view">
			<TitleRegion title="Sign" />
		</div>
	);
}

export default SignDetailsView;
