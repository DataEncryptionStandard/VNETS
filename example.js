module.exports = {
	'Login' : function (browser) {
		var username="admin";
		var userpass="root1234";
		browser
		.url('http://127.0.0.1')
		.assert.visible('#username')
		.assert.visible('#userpass')
		.setValue('input[id=username]', username)
		.setValue('input[id=userpass]', userpass)
		.click('button[type=submit]')
		.assert.containsText(".navbar-brand","LogStare Collector")
	},
	'step2' : function (browser) {
		console.log("step2")
		browser
		.end();
	}

};