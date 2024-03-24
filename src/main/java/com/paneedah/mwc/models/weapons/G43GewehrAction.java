package com.paneedah.mwc.models.weapons;

import com.paneedah.weaponlib.ModelWithAttachments;

import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
public class G43GewehrAction extends ModelWithAttachments {
	private final ModelRenderer Action;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;
	private final ModelRenderer cube_r16;
	private final ModelRenderer cube_r17;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;

	public G43GewehrAction() {
		textureWidth = 280;
		textureHeight = 280;

		Action = new ModelRenderer(this);
		Action.setRotationPoint(-3.3642F, -13.4642F, -27.1F);
		Action.cubeList.add(new ModelBox(Action, 106, 116, 2.3642F, -0.3358F, -1.0F, 2, 2, 2, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Action.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, -2.3562F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 84, 49, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, -0.5F, 0.0F);
		Action.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -2.3562F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 84, 51, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.0F, -1.0F, 0.0F);
		Action.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -2.3562F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 43, 84, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(1.55F, -0.5F, 0.0F);
		Action.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -1.5708F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 54, 98, -2.0F, -2.0F, -1.0F, 3, 2, 2, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(0.75F, -1.25F, 0.0F);
		Action.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -0.7854F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 69, 83, -0.8536F, -0.8536F, -0.5F, 1, 1, 1, 0.0F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 63, 83, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 57, 83, -0.1464F, -0.1464F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(1.95F, -0.75F, 0.0F);
		Action.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.0F, 0.0F, -1.5708F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 35, 103, -1.0F, -2.0F, -1.0F, 2, 3, 2, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(2.95F, -0.3358F, 0.0F);
		Action.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -0.7854F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 91, 116, -1.0F, -1.0F, -1.0F, 2, 2, 2, 0.0F, false));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(4.0107F, -1.6893F, 0.0F);
		Action.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.3011F, -0.7854F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 127, 114, -1.5F, -0.5F, -0.5F, 2, 1, 1, -0.1F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 84, 42, 0.5F, -0.5F, -0.5F, 1, 1, 1, 0.2F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(0.1989F, 0.6101F, -7.9659F);
		Action.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.7983F, -0.0092F, 1.2525F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 51, 76, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-0.0837F, 0.7004F, -7.6768F);
		Action.addChild(cube_r10);
		setRotationAngle(cube_r10, -0.7983F, -0.0092F, 1.2525F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 22, 91, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(0.1901F, 0.195F, -1.1742F);
		Action.addChild(cube_r11);
		setRotationAngle(cube_r11, -0.0129F, -0.0092F, 1.2525F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 51, 163, -0.1655F, 0.2093F, -6.5F, 1, 1, 10, 0.0F, false));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(0.1901F, 0.195F, -1.1742F);
		Action.addChild(cube_r12);
		setRotationAngle(cube_r12, -0.0056F, -0.0149F, 0.6591F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 156, 153, -0.2543F, -0.919F, -7.5F, 1, 1, 11, 0.0F, false));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(1.6036F, -0.2829F, -1.1777F);
		Action.addChild(cube_r13);
		setRotationAngle(cube_r13, -0.0283F, -0.0116F, 0.0F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 161, 97, -0.5F, -1.0703F, -6.5F, 1, 1, 10, 0.0F, false));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(0.1901F, 0.195F, -1.1742F);
		Action.addChild(cube_r14);
		setRotationAngle(cube_r14, -0.0108F, -0.0116F, 1.0518F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 161, 77, -0.5866F, -1.7517F, -7.5F, 1, 1, 11, 0.0F, false));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(3.0383F, 0.195F, -1.1742F);
		Action.addChild(cube_r15);
		setRotationAngle(cube_r15, -0.0108F, 0.0116F, -1.0518F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 119, 151, -0.4134F, -1.7517F, -7.5F, 1, 1, 11, 0.0F, false));

		cube_r16 = new ModelRenderer(this);
		cube_r16.setRotationPoint(3.0383F, 0.195F, -1.1742F);
		Action.addChild(cube_r16);
		setRotationAngle(cube_r16, -0.0056F, 0.0149F, -0.6591F);
		cube_r16.cubeList.add(new ModelBox(cube_r16, 156, 141, -0.7457F, -0.919F, -7.5F, 1, 1, 11, 0.0F, false));

		cube_r17 = new ModelRenderer(this);
		cube_r17.setRotationPoint(3.0383F, 0.195F, -1.1742F);
		Action.addChild(cube_r17);
		setRotationAngle(cube_r17, -0.0129F, 0.0092F, -1.2525F);
		cube_r17.cubeList.add(new ModelBox(cube_r17, 86, 163, -0.8345F, 0.2093F, -6.5F, 1, 1, 10, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(3.3121F, 0.7004F, -7.6768F);
		Action.addChild(cube_r18);
		setRotationAngle(cube_r18, -0.7983F, 0.0092F, -1.2525F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 41, 91, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(3.0295F, 0.6101F, -7.9659F);
		Action.addChild(cube_r19);
		setRotationAngle(cube_r19, -0.7983F, 0.0092F, -1.2525F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 35, 91, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Action.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}