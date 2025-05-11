<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=ta, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <table border="1">
        <tr><th>Name</th><th>password</th></tr>
        <?php
        $file=fopen("E:\namepass.txt","r");
        while(($line=fgets($file))!==false) {
            $parts=explode(":",trim($line));
            echo"<tr>";
            foreach($parts as $part) {
                echo "<td>".htmlspecialchars(trim($part))."</td>";
            }
                echo"</tr>";
        }
        fclose($file);
        
        ?>
    </table>
</body>
</html>