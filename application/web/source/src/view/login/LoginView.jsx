import HeadingRegion from "../../region/HeadingRegion";

function LoginView() {
	const clicky = (e) => {
		e.preventDefault();
	};
	return (
		<div id="login-view">
			<HeadingRegion heading="Login" />
			<form>
				<label htmlFor="username-input">Username</label>
				<br />
				<input type="text" name="username-input" />
				<br />
				<label htmlFor="password-input">Password</label>
				<br />
				<input type="password" name="password-input" />
				<br />
				<button id="login-button" onClick={clicky}>
					Login
				</button>
			</form>
		</div>
	);
}

export default LoginView;
