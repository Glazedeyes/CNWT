<?php
$a1=array(1,3,2,4,5);
$a2=array(9,7,6,10,8);
$num=array_merge($a1,$a2);
rsort($num);
print_r($num);
?>