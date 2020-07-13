import * as React from 'react';
import { StyleSheet, View, Text } from 'react-native';
import CameraCore from 'react-native-camera-core';

export default function App() {
  const [result, setResult] = React.useState<number | undefined>();
  const [message, setMessage] = React.useState('');

  React.useEffect(() => {
    CameraCore.multiply(3, 7).then(setResult);
    CameraCore.sayHi('My super custom message').then((message) =>
      setMessage(message)
    );
  }, []);

  return (
    <View style={styles.container}>
      <Text>Result: {result}</Text>
      <Text>{message}</Text>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    alignItems: 'center',
    justifyContent: 'center',
  },
});
