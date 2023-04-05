import React from "react";
import "./titleregion.css"

function TitleRegion({ title }) {
	const id = title === "Home" ? "landing" : title.toLowerCase();
	return <h1 id={id}>{title}</h1>;
}

export default TitleRegion;
