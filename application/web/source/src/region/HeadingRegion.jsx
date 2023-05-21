import React from "react";

function HeadingRegion({ heading }) {
	const id = heading === "Home" ? "landing" : heading.toLowerCase();
	return <h1 id={id}>{heading}</h1>;
}

export default HeadingRegion;
