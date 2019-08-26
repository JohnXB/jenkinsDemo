echo "Stopping xxx"
pid=`ps -ef|grep xxx-0.0.1-SNAPSHOT.jar|grep -v grep|awk '{print $2}'`
if [ -n "$pid" ]
then
   echo "kill -9 的pid:" $pid
   kill -9 $pid
fi