function getUrlParam(key) {
	return new URLSearchParams(window.location.search).get(key);
}

export default getUrlParam;
