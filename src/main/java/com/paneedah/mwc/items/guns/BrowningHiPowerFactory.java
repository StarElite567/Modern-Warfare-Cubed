package com.paneedah.mwc.items.guns;

import com.paneedah.mwc.MWC;
<<<<<<< Updated upstream
import com.paneedah.mwc.models.BrowningHiPower;
import com.paneedah.mwc.models.Emp1911Slide;
import com.paneedah.mwc.models.M1911frontsight;
import com.paneedah.mwc.models.makarovrearsight;
=======
import com.paneedah.mwc.init.MWCItems;
import com.paneedah.mwc.models.weapons.*;
>>>>>>> Stashed changes
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.mwc.weapons.Attachments;
import com.paneedah.mwc.weapons.AuxiliaryAttachments;
import com.paneedah.mwc.weapons.Magazines;
import com.paneedah.weaponlib.AttachmentCategory;
import com.paneedah.weaponlib.RenderableState;
import com.paneedah.weaponlib.Weapon;
import com.paneedah.weaponlib.WeaponRenderer;
import com.paneedah.mwc.rendering.Transform;
import com.paneedah.weaponlib.compatibility.RecoilParam;
import com.paneedah.weaponlib.config.BalancePackManager.GunConfigurationGroup;
import com.paneedah.weaponlib.crafting.CraftingEntry;
import com.paneedah.weaponlib.render.shells.ShellParticleSimulator.Shell.Type;
import net.minecraft.item.Item;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;

import java.util.Arrays;

public class BrowningHiPowerFactory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

        .withName("browning_hi_power")
        .withFireRate(0.65f)
        .withRecoil(4f)
        .withZoom(0.9f)
        .withConfigGroup(GunConfigurationGroup.SIDEARM)
        .withShellType(Type.PISTOL)
        .withMaxShots(1)
        .withShootSound("hi_power")
        .withSilencedShootSound("colt_m45a1_silenced")
        .withReloadSound("m45a1_reload")
        .withUnloadSound("pistol_unload")
        .withInspectSound("inspection")
        .withDrawSound("handgun_draw")
        .withReloadingTime(50)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")
        .withCrosshairZoomed("Sight")
        .withFlashIntensity(0.5f)
        .withFlashScale(() -> 0.6f)
        .withFlashOffsetX(() -> 0.13f)
        .withFlashOffsetY(() -> 0.12f)
//      .withShellCasingForwardOffset(0.001f)
        .withInaccuracy(3)
        .withCreativeTab(MWC.WEAPONS_TAB)
<<<<<<< Updated upstream
        .withInformationProvider(stack -> Arrays.asList(
        "Type: Single Action Semi-Automatic Pistol", 
        "Damage: 5", 
        "Cartridge: 9x19mm",
        "Fire Rate: SEMI",
        "Rate of Fire: 65/100",
        "Magazines:",
        "13rnd 9x19mm Magazine"))
         
=======
        .useNewSystem()
        .withRecoilParam(new RecoilParam(
        		// The weapons power
        		45.0,
        		// Muzzle climb divisor
        		13.5,
        		// "Stock Length"
        		37.5,
        		// Recovery rate from initial shot
        		0.425,
        		// Recovery rate @ "stock"
        		0.2125,
        		// Recoil rotation (Y)
        		0.0,
        		// Recoil rotation (Z)
        		0.0,
        		// Ads similarity divisor
        		1.0
        ))
>>>>>>> Stashed changes
         .withScreenShaking(RenderableState.SHOOTING, 
                 4f, 
                 0.1f, 
                 1.5f)
         
        .withUnremovableAttachmentCategories(AttachmentCategory.GUARD)
        .withCompatibleAttachment(Attachments.PistolPlaceholder, true, (model) -> {
            GL11.glTranslatef(0.01f, -0.19f, -0.4f);
            GL11.glScaled(0F, 0F, 0F);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.BrowningHiPowerSlide, true, (model) -> {
<<<<<<< Updated upstream
            if(model instanceof Emp1911Slide) {
                GL11.glScaled(1F, 1F, 1F);
//                GL11.glTranslatef(0F, 0F, 0.5F);
            }
            else if(model instanceof makarovrearsight) {
=======
            if(model instanceof makarovrearsight) {
>>>>>>> Stashed changes
                GL11.glTranslatef(-0.155F, -1.155F, -0.15F);
                GL11.glScaled(0.3F, 0.3F, 0.3F);
            }
            else if(model instanceof M1911frontsight) {
                GL11.glTranslatef(-0.15F, -1.145F, -2.45F);
                GL11.glScaled(0.25F, 0.25F, 0.25F);
            }
        })
        .withCompatibleAttachment(Magazines.HiPowerMag, (model) -> {
            GL11.glTranslatef(0F, 0.2F, 0.12F);
        })
//        .withCompatibleAttachment(Attachments.Silencer45ACP, (model) -> {
//            GL11.glTranslatef(-0.23F, -1.14F, -4.92F);
//            GL11.glScaled(1.5F, 1.5F, 1.5F);
//        })

        .withTextureNames("BrowningHiPower")
        .withRenderer(new WeaponRenderer.Builder()
    
            .withModel(new BrowningHiPower())
<<<<<<< Updated upstream
            //.withTextureName("M9")
            //.withWeaponProximity(0.99F)
            //.withYOffsetZoom(5F)
=======
            .withActionPiece(
            		AuxiliaryAttachments.BrowningHiPowerSlide)
            .withActionTransform(new Transform().withPosition(0, 0, 0.5F))
>>>>>>> Stashed changes
            .withEntityPositioning(itemStack -> {
                GL11.glScaled(0.4F, 0.4F, 0.4F);
                GL11.glRotatef(-90F, 0f, 0f, 4f);
            })
            .withInventoryPositioning(itemStack -> {
                GL11.glScaled(0.35F, 0.35F, 0.35F);
                GL11.glTranslatef(0, 0.8f, 0);
                GL11.glRotatef(-120F, -0.5f, 7f, 3f);
            })
            .withThirdPersonPositioning((renderContext) -> {
                GL11.glScaled(0.5F, 0.5F, 0.5F);
                GL11.glTranslatef(-1.8F, -1F, 2F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })
                
<<<<<<< Updated upstream
            .withFirstPersonPositioning((renderContext) -> {
                GL11.glScaled(2F, 2F, 2F);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(12F, 0f, 0f, 1f);
                GL11.glTranslatef(-0.100000f, 0.80000f, -2.1f);
                
//                GL11.glScaled(2F, 2F, 2F);
//                GL11.glRotatef(45F, 0f, 1f, 0f);
//                GL11.glRotatef(13F, 0f, 0f, 1f);
//                GL11.glTranslatef(0.400000f, 0.750000f, -2.1f);
                })
                
            .withFirstPersonPositioningRecoiled((renderContext) -> {
                GL11.glScaled(2F, 2F, 2F);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(12F, 0f, 0f, 1f);
                GL11.glTranslatef(-0.100000f, 0.800000f, -1.4f);
                GL11.glRotatef(-9F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioningProning((renderContext) -> {
                GL11.glScaled(2F, 2F, 2F);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(14F, 0f, 0f, 1f);
                GL11.glTranslatef(-0.25f, 0.45f, -2f);
                
//                GL11.glScaled(2F, 2F, 2F);
//                GL11.glRotatef(-5.000000f, 1f, 0f, 0f);
//                GL11.glRotatef(36.000000f, 0f, 1f, 0f);
//                GL11.glRotatef(35.000000f, 0f, 0f, 1f);
//                GL11.glTranslatef(-0.5f, 1.1f, -1.8f);
                })
                
            .withFirstPersonPositioningProningRecoiled((renderContext) -> {
                GL11.glScaled(2F, 2F, 2F);
                GL11.glRotatef(45F, 0f, 1f, 0f);
                GL11.glRotatef(18F, 0f, 0f, 1f);
                GL11.glTranslatef(-0.25f, 0.45f, -1.8f);
                GL11.glRotatef(-3F, 1f, 0f, 0f);    
                })
                
            .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.BrowningHiPowerSlide.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0F, 0F, 0.5F);
//              GL11.glRotatef(45F, 0f, 1f, 0f);
//              GL11.glScaled(0.55F, 0.55F, 0.55F);
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.BrowningHiPowerSlide.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0F, 0F, 0.5F);
//              GL11.glRotatef(45F, 0f, 1f, 0f);
//              GL11.glScaled(0.55F, 0.55F, 0.55F);
                })
=======
            .withFirstPersonPositioning(
					new Transform()
					.withPosition(-0.945000f, 4.065000f, -7.845000f)
					.withRotation(0.000000f, 1.000000f, 10.681469f)
					.withPivotPoint(-0.12000000357627871F, -0.36000001072883614F, 0.040000001192092904F)
                    .withScale(3.0F, 3.0F, 3.0F)
                )
                
                .withFirstPersonHandPositioning(
                        
                        // Left hand
                        new Transform()
                        .withPosition(1.370000f, 0.865000f, 2.020000f)
                        .withBBRotation(-12.9672F, -29.0825F, 67.8433F)
                        .withScale(3, 3, 4)
                        .withPivotPoint(0, 0, 0),
                        
                        
                        
                        // Right hand
                        new Transform()
                        .withPosition(-0.320000f, 0.220000f, 2.040000f)
                        .withBBRotation(10.0931F, 10.9576F, -10.0294F)
                        .withScale(3, 3, 3.5F)
                        .withPivotPoint(0, 0, 0)
>>>>>>> Stashed changes
                
                )
                
                .setupModernAnimations("glock", AuxiliaryAttachments.BrowningHiPowerSlide)
                .setupModernMagazineAnimations("glock", Magazines.HiPowerMag)
                        
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.BrowningHiPowerSlide.getRenderablePart(), (renderContext) -> {
                if(renderContext.getWeaponInstance().getAmmo() == 0) {
                    GL11.glTranslatef(0F, 0F, 0.5F);
                }
            })

            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glScaled(3F, 3F, 3F);
                GL11.glTranslatef(0.1f, 0.65f, -2f);
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.RMR)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.22f, 0f);
                } 
                
                // Everything else
                else {
                }
                
            
                })
                
            .withFirstPersonPositioningModifying((renderContext) -> {
				 new Transform()
				 .withPosition(-0.945000f, 3.625000f, -7.165000f)
				 .withRotation(-4.041486f, -30.854630f, -19.420376f)
				 .withPivotPoint(-0.120000f, -0.360000f, 0.040000f)
				 .withScale(3.000000f, 3.000000f, 3.000000f)
				 .applyTransformations();
			 })
			 .withFirstPersonPositioningModifyingAlt((renderContext) -> {
				 new Transform()
				 .withPosition(-0.945000f, 3.625000f, -7.885000f)
				 .withRotation(-4.041486f, -45.595835f, -21.768277f)
				 .withPivotPoint(-0.350000f, -2.900000f, -0.100000f)
				 .withScale(3.000000f, 3.000000f, 3.000000f)
				 .applyTransformations();
			 })
          
			 .withFirstPersonHandPositioningModifying(
                   (renderContext) -> {
                  	 new Transform()
                  	 .withPosition(2.770000f, 1.225000f, 0.140000f)
                  	 .withRotation(73.670132f, -70.659155f, 41.991085f)
                       .withScale(2.6F, 2.6F, 4.0F)
                       .withPivotPoint(0.000000f, 0.000000f, 0.000000f)
                       .applyTransformations();
                   }, 
                   (renderContext) -> {
                  	 new Transform()
                  	 .withPosition(-0.320000f, 0.140000f, 2.040000f)
                       .withBBRotation(10.0931F, 10.9576F, -10.0294F)
                       .withScale(3, 3, 3.5F)
                       .withPivotPoint(0, 0, 0)
                       .applyTransformations();
                   })
                   
          .withFirstPersonHandPositioningModifyingAlt(
          		(renderContext) -> {
                 	 new Transform()
	                   	 .withPosition(2.770000f, 1.225000f, 0.140000f)
	                   	 .withRotation(73.670132f, -70.659155f, 41.991085f)
                      .withScale(2.6F, 2.6F, 4.0F)
                      .withPivotPoint(0.000000f, 0.000000f, 0.000000f)
                      .applyTransformations();
                  }, 
                  (renderContext) -> {
                 	 new Transform()
                 	 .withPosition(-0.320000f, 0.140000f, 2.040000f)
                      .withBBRotation(10.0931F, 10.9576F, -10.0294F)
                      .withScale(3, 3, 3.5F)
                      .withPivotPoint(0, 0, 0)
                      .applyTransformations();
                  })

				  
            .build())
        .withSpawnEntityDamage(5f)
        .withSpawnEntityGravityVelocity(0.02f)
        
         
        .build(MWC.modContext);
    }
}
