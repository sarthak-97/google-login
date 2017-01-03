<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>ACE Autocompletion demo</title>
  <style type="text/css" media="screen">
    body {
        overflow: hidden;
    }
    
    #editor { 
        margin: 0;
        position: absolute;
        top: 0;
        bottom: 0;
        left: 0;
        right: 0;
    }
  </style>
</head>
<body>
<form method='POST' action='/submission' enctype='multipart/form-data'>

<div class="row">
	<div class="col-md-10 col-md-offset-1">
    Question : <br /><br />
    </div>
</div>

<div class="row">
	<div class="col-md-10 col-md-offset-1">
	Constraint 
	</div>
</div>

<div class="row">
	<div class="col-md-10 col-md-offset-1">
	Input Format <br /><br />
	</div>
</div>

<div class="row">
	<div class="col-md-10 col-md-offset-1">
	Output Format<br /><br />
	</div>
</div>

<div class="row">
	<div class="col-md-10 col-md-offset-1">
	Sample TestCase <br /><br />
	</div>
</div>
<br>
 <select class="language">
  <option value="Select">Select</option>
  <option value="C">C</option>
  <option value="C++">C++</option>
  <option value="Java">Java</option>
  <option value="Python">Python</option>
</select> <br>
<br>
<input type='submit' class='btn btn-default' value='Submit' />
<br>



<pre id="editor2">minHeight = 2 lines</pre>

<!-- load ace -->
<script src="resources/src/ace.js"></script>
<!-- load ace language tools -->
<script src="resources/src/ext-language_tools.js"></script>
<script>
    // trigger extension
    

 

    var editor2 = ace.edit("editor2");
    editor2.setTheme("ace/theme/tomorrow_night_blue");
    editor2.session.setMode("ace/mode/html");
    editor2.setAutoScrollEditorIntoView(true);
    editor2.setOption("maxLines", 30);
    editor2.setOption("minLines", 8);

   
    
</script>

    




<script src="resources/src/show_own_source.js "></script>
</form>

</body>
</html>
