import React, { useEffect } from 'react';
import { Alert,View,Text } from 'react-native';
import messaging from '@react-native-firebase/messaging';

function App() {
  useEffect(() => {
    const unsubscribe = messaging().onMessage(async remoteMessage => {
      Alert.alert('A new FCM message arrived!', JSON.stringify(remoteMessage));
    });

    return unsubscribe;
  }, []);

  useEffect(()=>{
    let result =  messaging().getToken()
    console.log('result',result)
  },[])

  return(
    <View>
      <Text>gds</Text>
    </View>
  )
}
export default App;