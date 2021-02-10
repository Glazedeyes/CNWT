<?php
$fp1 = fopen("sample1.txt", "r");
$fp2 = fopen("sample2.txt", "w");
$FileContents = fread($fp1, 15);
echo "The contents of First file are: "."<br>".$FileContents."<br>";

while(!feof($fp1))
{ 
  echo fputs($fp2,$FileContents). "<br />";
  if($fp1!=false) break;
}
printf("File copied successfully.\n");
fclose($fp1);
fclose($fp2);
?>