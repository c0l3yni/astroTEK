function HeadingRegion({ heading }) {
	const id =
		heading === "Home"
			? "landing-heading"
			: heading.replaceAll(" ", "-").toLowerCase() + "-heading";

	return <h1 id={id}>{heading}</h1>;
}

export default HeadingRegion;
