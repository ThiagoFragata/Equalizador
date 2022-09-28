import React from 'react';

import {
  SafeAreaView,
  ScrollView,
  StatusBar,
  StyleSheet,
  Text,
  TouchableOpacity,
} from 'react-native';

import {NativeModules} from 'react-native';
const {EqualizerModule} = NativeModules;

export default function App() {
  function changeToEqualizer() {
    return EqualizerModule.createEqualizer();
  }

  return (
    <SafeAreaView style={styles.container}>
      <ScrollView contentInsetAdjustmentBehavior="automatic">
        <StatusBar barStyle="light-content" backgroundColor="transparent" />
        <Text style={styles.title}>Equalizador</Text>
        <TouchableOpacity onPress={changeToEqualizer}>
          <Text style={styles.button}>Chamar Modulo Nativo</Text>
        </TouchableOpacity>
      </ScrollView>
    </SafeAreaView>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    padding: 24,
    backgroundColor: '#2c2c2c',
  },
  title: {
    fontSize: 24,
    textAlign: 'center',
    marginVertical: 32,
  },
  button: {
    backgroundColor: '#f77f00',
    color: '#2c2c2c',
    fontWeight: 'bold',
    textAlign: 'center',
    padding: 16,

    borderRadius: 16,
  },
});
