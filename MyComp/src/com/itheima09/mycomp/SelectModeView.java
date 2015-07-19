package com.itheima09.mycomp;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.EditText;
import android.widget.RelativeLayout;

public class SelectModeView extends RelativeLayout {

	private EditText	et_phone;
	private CheckBox	cb_sms;
	private CheckBox	cb_phone;

	public SelectModeView(Context context, AttributeSet attrs) {
		super(context, attrs);
		initView();// 初始化界面
		
		String twoText = attrs.getAttributeValue("http://schemas.android.com/apk/res/" + getContext().getPackageName(), "twotext");
		String oneText = attrs.getAttributeValue("http://schemas.android.com/apk/res/" + getContext().getPackageName(), "onetext");
	
		cb_sms.setText(oneText);
		cb_phone.setText(twoText);
	}
	
	
	/**
	 * @return
	 *      返回的是编辑框的文件
	 */
	public String getEditTextMess(){
		return et_phone.getText().toString().trim();
	}
	
	/**
	 * @return
	 *    返回的是短信的复选框的状态
	 */
	public boolean getCheckBoxSms(){
		return cb_sms.isChecked();
	}
	
	/**
	 * @param selectState
	 *     设置复选框的状态
	 */
	public void setCheckBoxSms(boolean selectState){
		cb_sms.setChecked(selectState);
	}
	
	/**
	 * @param listener
	 *    给短信的复选框设置事件
	 */
	public void setOnCheckedChangeListenerForSms(OnCheckedChangeListener listener){
		cb_sms.setOnCheckedChangeListener(listener);
	}
	
	
	
	/**
	 * @return
	 *    返回的是短信的复选框的状态
	 */
	public boolean getCheckBoxPhone(){
		return cb_phone.isChecked();
	}
	
	/**
	 * @param selectState
	 *     设置复选框的状态
	 */
	public void setCheckBoxPhone(boolean selectState){
		cb_phone.setChecked(selectState);
	}
	
	/**
	 * @param listener
	 *    给短信的复选框设置事件
	 */
	public void setOnCheckedChangeListenerForPhone(OnCheckedChangeListener listener){
		cb_phone.setOnCheckedChangeListener(listener);
	}
	
	
	
	

	private void initView() {
		View compView = View.inflate(getContext(), R.layout.layout_sex_comp, null);
		addView(compView);
		//电话号码的编辑框
		et_phone = (EditText) compView.findViewById(R.id.et_select_intercept_phone);
		
		//短信的拦截勾选
		cb_sms = (CheckBox) compView.findViewById(R.id.cb_select_intercept_sms);
		
		//电话的拦截勾选
		cb_phone = (CheckBox) compView.findViewById(R.id.cb_select_intercept_phone);
	}

	public SelectModeView(Context context) {
		this(context,null);
	}

}
