package com.example.myapplication;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	// Вызывается при создании Активности
	@Override
	public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	// Инициализация Активности
	setContentView(R.layout.activity_main);
	Toast.makeText(this, "onCreate()", Toast.LENGTH_LONG).show();
	}
	
	// Вызывается после завершения метода onCreate
	// Используется для восстановления состояния UI
	@Override
	public void onRestoreInstanceState(Bundle savedInstanceState) {
	super.onRestoreInstanceState(savedInstanceState);
	// Восстановление состояние UI из объекта savedInstanceState.
	// Данный объект также был передан методу onCreate.
	}
	// Вызывается перед тем, как Активность снова становится видимой
	@Override
	public void onRestart(){
	super.onRestart();
	// Восстановить состояние UI с учетом того,
	// что данная Активность уже была видимой.
	}
	// Вызывается, когда Активность стала видимой
	@Override
	public void onStart(){
	super.onStart();
	// Проделать необходимые действия для
	// Активности, видимой на экране
	}
	// Должен вызываться в начале видимого состояния.
	// На самом деле Android вызывает данный обработчик только
	// для Активностей, восстановленных из неактивного состояния
	@Override
	public void onResume(){
	super.onResume();
	// Восстановить приостановленные обновления UI,
	// потоки и процессы, замороженные, когда
	// Активность была в неактивном состоянии
	}
	// Вызывается перед выходом из активного состояния,
	// позволяя сохранить состояние в объекте savedInstanceState
	@Override
	public void onSaveInstanceState(Bundle savedInstanceState) {
	// Объект savedInstanceState будет в последующем
	// передан методам onCreate и onRestoreInstanceState
	super.onSaveInstanceState(savedInstanceState);
	}
	// Вызывается перед выходом из активного состояния
	@Override
	public void onPause(){
	// «Заморозить» обновления UI, потоки или
	// «трудоемкие» процессы, не нужные, когда Активность
	// не на переднем плане
	super.onPause();
	}
	// Вызывается перед выходом из видимого состояния
	@Override
	public void onStop(){
	// «Заморозить» обновления UI, потоки или
	// «трудоемкие» процессы, ненужные, когда Активность
	// не на переднем плане.
	// Сохранить все данные и изменения в UI, так как
	// процесс может быть в любой момент убит системой
	super.onStop();
	}
	// Вызывается перед уничтожением активности
	@Override
	public void onDestroy(){
	// Освободить все ресурсы, включая работающие потоки,
	// соединения с БД и т. д.
	super.onDestroy();
	}
}
