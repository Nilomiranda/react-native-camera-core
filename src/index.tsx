import { NativeModules } from 'react-native';

type CameraCoreType = {
  multiply(a: number, b: number): Promise<number>;
  sayHi(message: string): Promise<string>;
};

const { CameraCore } = NativeModules;

export default CameraCore as CameraCoreType;
