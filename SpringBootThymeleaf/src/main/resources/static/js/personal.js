

function test() {
	
	let pathData = {};
	let url = "/test";
    let userJson = JSON.stringify(pathData);
	
	    $.ajax
	    ({
	    	type: "POST",
	        data: userJson,
	        url: url,
	        contentType: "application/json; charset=utf-8",
	        success: function(response)
	    	{
	        	
	        	let arrayBuffer = base64ToArrayBuffer(response["id1111111 text text file.txt"]);
	        	saveByteArray("Sample Report.txt", arrayBuffer);
	        	
	        	//console.log(response["id1111111 text text file.txt"]);
	    	}	
	    });
	
}

function base64ToArrayBuffer(base64) {
    
	var binaryString = window.atob(base64);
    var binaryLen = binaryString.length;
    var bytes = new Uint8Array(binaryLen);
    for (var i = 0; i < binaryLen; i++) {
       var ascii = binaryString.charCodeAt(i);
       bytes[i] = ascii;
    }
    return bytes;
}

function saveByteArray(reportName, byte) {
	
    var blob = new Blob([byte], {type: "application/txt"});
    var link = document.createElement('a');
    link.href = window.URL.createObjectURL(blob);
    var fileName = reportName;
    link.download = fileName;
    link.click();
};