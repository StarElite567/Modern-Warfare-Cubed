package com.paneedah.mwc.items.guns;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.init.MWCItems;
import com.paneedah.mwc.models.weapons.*;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.mwc.weapons.*;
import com.paneedah.weaponlib.*;
import com.paneedah.mwc.rendering.Transform;
import com.paneedah.weaponlib.animation.Transition;
import com.paneedah.weaponlib.compatibility.RecoilParam;
import com.paneedah.weaponlib.config.BalancePackManager.GunConfigurationGroup;
import com.paneedah.weaponlib.crafting.CraftingEntry;
import net.minecraft.item.Item;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;

public class ScarLFactory implements GunFactory {
    
    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()
                .withName("scar_l")
                .withFireRate(0.6f)
                .withRecoil(3f)
                .withZoom(0.9f)
                .withConfigGroup(GunConfigurationGroup.ASSAULT_RIFLE)
                .hasFlashPedals()
                .withMaxShots(1, Integer.MAX_VALUE)
                .withMuzzlePosition(new Vec3d(-.2, -1, -6.7))
                .withShootSound("scar_l")
                .withSilencedShootSound("m4a1_silenced")
                .withReloadSound("scar_reload")
                .withUnloadSound("scar_unload")
                .withEndOfShootSound("gun_click")
                .withInspectSound("inspection")
                .withDrawSound("noaction_draw")
                .withReloadingTime(50)
                .withFlashIntensity(0.5f)
                .withFlashScale(() -> 0.6f)
                .withFlashOffsetX(() -> 0.1f)
                .withFlashOffsetY(() -> 0.17f)
                .withShellCasingForwardOffset(0.05f)
                .withShellCasingVerticalOffset(-0.03f)
                .withCreativeTab(MWC.WEAPONS_TAB)
                .useNewSystem()
                .withRecoilParam(new RecoilParam(
                        15.0,
                        15.75,
                        50.0,
                        0.4,
                        0.3125,
                        0.0,
                        0.0,
                        1.0
                ))

                .withScreenShaking(RenderableState.SHOOTING,
                        1f,
                        1f,
                        3f)

                .withModernRecipe(new
                        CraftingEntry(MWCItems.carbonComposite, 8), new
                        CraftingEntry(MWCItems.gunmetalPlate, 13), new
                        CraftingEntry(MWCItems.steelIngot, 3))

                .withUnremovableAttachmentCategories(AttachmentCategory.GUARD)
                .withUnremovableAttachmentCategories(AttachmentCategory.STOCK)
                .withUnremovableAttachmentCategories(AttachmentCategory.BACKGRIP)
                .withUnremovableAttachmentCategories(AttachmentCategory.RECEIVER)
                .withCompatibleAttachment(Attachments.ScarHandGuard, true, (model) -> {
                })
                .withCompatibleAttachment(Attachments.ScarMidWestIndustriesHandGuard, (model) -> {
                })
                .withCompatibleAttachment(Attachments.ScarMLOKHandguard, (model) -> {
                })
                .withCompatibleAttachment(Attachments.ScarStock, true, (model) -> {
                })
                .withCompatibleAttachment(Attachments.ScarHStock, (model) -> {
                })
                .withCompatibleAttachment(Attachments.ScarRetractableStock, (model) -> {
                })
                .withCompatibleAttachment(Attachments.ScarAdapterStock, (model) -> {
                    if (model instanceof MilSpecStock) {
                        GL11.glTranslatef(0f, -0.28f, 0.2f);
                    }
                })
                .withCompatibleAttachment(Attachments.ScarLReceiver, true, (model) -> {
                })
                .withCompatibleAttachment(Attachments.M4Grip, (model) -> {
                    GL11.glTranslatef(0f, 0.04f, -0.08f);
                })
                .withCompatibleAttachment(Attachments.M4GripTan, (model) -> {
                    GL11.glTranslatef(0f, 0.04f, -0.08f);
                })
                .withCompatibleAttachment(Attachments.M4GripGray, (model) -> {
                    GL11.glTranslatef(0f, 0.04f, -0.08f);
                })
                .withCompatibleAttachment(Attachments.M110Grip, true, (model) -> {
                    GL11.glTranslatef(0f, 0.04f, -0.08f);
                })
                .withCompatibleAttachment(Magazines.M4A1Mag, (model) -> {
                    GL11.glTranslatef(-0.335F, 0.4F, -1.4F);
                    GL11.glScaled(1.04F, 1.25F, 1.25F);
                })
                .withCompatibleAttachment(Magazines.SOCOM_Mag, (model) -> {
                    GL11.glTranslatef(-0.335F, 0.4F, -1.4F);
                    GL11.glScaled(1.04F, 1.25F, 1.25F);
                })
                .withCompatibleAttachment(Magazines.M38Mag, (model) -> {
                    GL11.glTranslatef(-0.335F, 0.4F, -1.4F);
                    GL11.glScaled(1.04F, 1.25F, 1.25F);
                })
                .withCompatibleAttachment(Magazines.Stanag50, (model) -> {
                    GL11.glTranslatef(0F, 0.05F, -0.16F);
                })
                .withCompatibleAttachment(Magazines.Stanag60, (model) -> {
                    GL11.glRotatef(-10F, 1f, 0f, 0f);
                    GL11.glTranslatef(0F, 0.25F, -0.16F);
                })
                .withCompatibleAttachment(Magazines.Stanag100, (model) -> {
                    GL11.glTranslatef(-0.35F, 0.69F, -1.4F);
                    GL11.glScaled(1.15F, 1.2F, 1.15F);
                })
                .withCompatibleAttachment(AuxiliaryAttachments.ScarAction, true, (model) -> {
                })
                .withCompatibleAttachment(Attachments.AKMIron, true, (model) -> {
                    if (model instanceof M4Iron1) {
                        GL11.glTranslatef(-0.16F, -1.5F, -0.3F);
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof M4Iron2) {
                        GL11.glTranslatef(0.255F, -1.55F, -2.25F);
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof P90iron) {
                        GL11.glTranslatef(0.26F, -1.55F, -2.35F);
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof AKMiron1) {
                        GL11.glTranslatef(0.125F, -1.8F, -0.5F);
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof AKMiron2) {
                        GL11.glTranslatef(0.13F, -1.55F, -3.05F);
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof AK47iron) {
                        GL11.glTranslatef(0.092F, -1.91F, -0.9F);
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof G36CIron1) {
                        GL11.glTranslatef(-0.22F, -1.94F, 0.13F);
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof G36CIron2) {
                        GL11.glTranslatef(-0.205F, -1.9F, -3.15F);
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof ScarIron1) {
                        GL11.glTranslatef(-0.1635F, -1.71F, -0.1F);
                        GL11.glScaled(0.36F, 0.36F, 0.36F);
                    } else if (model instanceof ScarIron2) {
                        GL11.glTranslatef(-0.085F, -1.67F, -4.15F);
                        GL11.glScaled(0.45F, 0.45F, 0.45F);
                    } else if (model instanceof FALIron) {
                        GL11.glTranslatef(-0.11F, -1.78F, -4.1F);
                        GL11.glScaled(0.07F, 0.25F, 0.2F);
                        GL11.glRotatef(180F, 0f, 0f, 1f);
                    } else if (model instanceof M14Iron) {
                        GL11.glTranslatef(0.129F, -1.63F, -2.08F);
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof MP5Iron) {
                        GL11.glTranslatef(0.215F, -1.54F, 1.2F);
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof MBUSiron) {
                        GL11.glTranslatef(0.215F, -1.54F, 1.2F);
                        GL11.glScaled(0F, 0F, 0F);
                    } else if (model instanceof M27rearsight) {
                        GL11.glTranslatef(0.215F, -1.54F, 1.2F);
                        GL11.glScaled(0F, 0F, 0F);
                    }
                })
                .withCompatibleAttachment(Attachments.NightRaider, () -> {
                    GL11.glTranslatef(-0.212F, -1.6F, -1.9F);
                    GL11.glScaled(0.75F, 0.75F, 0.75F);
                }, (model) -> {
                    if (model instanceof JPUreticle) {
                        GL11.glTranslatef(0.12F, -0.2F, 2.49F);
                        GL11.glScaled(0.03F, 0.03F, 0.03F);
                    }
                })
                .withCompatibleAttachment(Attachments.ACOG, () -> {
                    GL11.glTranslatef(-0.31F, -1.65F, -0.7F);
                    GL11.glScaled(0.8F, 0.8F, 0.8F);
                }, (model) -> {
                    if (model instanceof AcogScope2) {
                        GL11.glTranslatef(-0.018F, -0.25F, 0.13F);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof AcogReticle) {
                        GL11.glTranslatef(0.243F, -0.23F, 0.68f);
                        GL11.glScaled(0.03F, 0.03F, 0.03F);
                    }
                })
                .withCompatibleAttachment(Attachments.Specter, () -> {
                    GL11.glTranslatef(-0.19F, -1.30F, -1.3F);
                    GL11.glScaled(0.45F, 0.45F, 0.45F);
                }, (model) -> {
                    if (model instanceof Acog2) {
                        GL11.glTranslatef(0.15F, -1.035F, 1.513F);
                        GL11.glScaled(0.1F, 0.1F, 0.1F);
                    }
                })
                .withCompatibleAttachment(Attachments.LeupoldRailScope, () -> {
                    GL11.glTranslatef(-0.155F, -1.46F, -2F);
                    GL11.glScaled(0.45F, 0.45F, 0.45F);
                }, (model) -> {
                    if (model instanceof JPUreticle) {
                        GL11.glTranslatef(0.076F, -0.67F, 4.0251F);
                        GL11.glScaled(0.04F, 0.04F, 0.04F);
                    }
                })
                .withCompatibleAttachment(Attachments.Reflex, () -> {
                    GL11.glTranslatef(-0.066F, -1.44F, -1.1F);
                    GL11.glScaled(0.45F, 0.45F, 0.45F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(-0.125F, -0.7F, -0.4F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.MicroReflex, () -> {
                    GL11.glTranslatef(-0.148F, -2.14F, -1F);
                    GL11.glScaled(0.35F, 0.35F, 0.35F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(0.08F, 0.97F, -0.4F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.BijiaReflex, () -> {
                    GL11.glTranslatef(-0.06F, -1.41F, -1F);
                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(-0.125F, -0.68F, -0.4F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.Holographic, () -> {
                    GL11.glTranslatef(-0.035F, -1.46F, -1.1F);
                    GL11.glScaled(0.75F, 0.75F, 0.75F);
                }, (model) -> {
                    if (model instanceof Holo2) {
                        GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                        GL11.glScaled(0.1F, 0.1F, 0.1F);
                    }
                })
                .withCompatibleAttachment(Attachments.HolographicAlt, () -> {
                    GL11.glTranslatef(-0.035F, -1.46F, -1.1F);
                    GL11.glScaled(0.75F, 0.75F, 0.75F);
                }, (model) -> {
                    if (model instanceof Holo2) {
                        GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                        GL11.glScaled(0.1F, 0.1F, 0.1F);
                    }
                })
                .withCompatibleAttachment(Attachments.EotechHybrid2, () -> {
                    GL11.glTranslatef(-0.035F, -1.46F, -1.4F);
                    GL11.glScaled(0.75F, 0.75F, 0.75F);
                }, (model) -> {
                    if (model instanceof EotechScopeRing) {
                        GL11.glTranslatef(-0.2F, -0.41F, 1.8F);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                    if (model instanceof Holo2) {
                        GL11.glTranslatef(-0.118F, -0.535F, 1.9F);
                        GL11.glScaled(0.05F, 0.05F, 0.05F);
                    }
                })
                .withCompatibleAttachment(Attachments.VortexRedux, () -> {
                    GL11.glTranslatef(-0.32F, -1.67F, -1.3F);
                    GL11.glScaled(0.5F, 0.5F, 0.5F);
                }, (model) -> {
                    if (model instanceof Holo2) {
                        GL11.glTranslatef(0.395F, -0.33F, -0.1F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.Kobra, () -> {
                    GL11.glTranslatef(-0.03F, -1.44F, -1F);
                    GL11.glScaled(0.73F, 0.73F, 0.73F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.KobraGen3, () -> {
                    GL11.glTranslatef(-0.03F, -1.44F, -1F);
                    GL11.glScaled(0.73F, 0.73F, 0.73F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.MicroT1, () -> {
                    GL11.glTranslatef(-0.175F, -1.65F, -1F);
                    GL11.glScaled(0.4F, 0.4F, 0.4F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.AimpointCompM5, () -> {
                    GL11.glTranslatef(-0.175F, -1.65F, -1F);
                    GL11.glScaled(0.4F, 0.4F, 0.4F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.AimpointCompM2, () -> {
                    GL11.glTranslatef(-0.12F, -1.02F, -1F);
                    GL11.glScaled(0.8F, 0.8F, 0.8F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(-0.005F, -0.89F, -1.5F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.Grip2, (model) -> {
                    GL11.glTranslatef(-0.2F, -0.32F, -3F);
                    GL11.glScaled(1F, 1F, 1F);
                })
                .withCompatibleAttachment(Attachments.StubbyGrip, (model) -> {
                    GL11.glTranslatef(-0.2F, -0.32F, -3F);
                    GL11.glScaled(1F, 1F, 1F);
                })
                .withCompatibleAttachment(Attachments.AngledGrip, (model) -> {
                    GL11.glTranslatef(-0.2F, -0.14F, -3.2F);
                    GL11.glScaled(1.1F, 1F, 1F);
                })
                .withCompatibleAttachment(Attachments.JunoGrip, (model) -> {
                    GL11.glTranslatef(-0.23F, -0.74F, -3.5F);
                    GL11.glScaled(0.8F, 0.8F, 0.8F);
                })
                .withCompatibleAttachment(Attachments.VGrip, (model) -> {
                    GL11.glTranslatef(-0.2F, -0.32F, -3F);
                    GL11.glScaled(1F, 1F, 1F);
                })
                .withCompatibleAttachment(Attachments.Grip2Tan, (model) -> {
                    GL11.glTranslatef(-0.2F, -0.32F, -3F);
                    GL11.glScaled(1F, 1F, 1F);
                })
                .withCompatibleAttachment(Attachments.StubbyGripTan, (model) -> {
                    GL11.glTranslatef(-0.2F, -0.32F, -3F);
                    GL11.glScaled(1F, 1F, 1F);
                })
                .withCompatibleAttachment(Attachments.AngledGripTan, (model) -> {
                    GL11.glTranslatef(-0.2F, -0.14F, -3.2F);
                    GL11.glScaled(1.1F, 1F, 1F);
                })
                .withCompatibleAttachment(Attachments.JunoGripTan, (model) -> {
                    GL11.glTranslatef(-0.23F, -0.74F, -3.5F);
                    GL11.glScaled(0.8F, 0.8F, 0.8F);
                })
                .withCompatibleAttachment(Attachments.VGripTan, (model) -> {
                    GL11.glTranslatef(-0.2F, -0.32F, -3F);
                    GL11.glScaled(1F, 1F, 1F);
                })
                .withCompatibleAttachment(Attachments.Bipod, (model) -> {
                    GL11.glTranslatef(-0.2F, -0.27F, -3.5F);
                    GL11.glScaled(0.9F, 0.9F, 0.9F);
                })
                .withCompatibleAttachment(Attachments.Laser2, () -> {
                    GL11.glTranslatef(-0.25F, -0.9F, -4F);
                    GL11.glScaled(0.8F, 0.8F, 0.8F);
                    GL11.glRotatef(180F, 0f, 0f, 1f);
                })
                .withCompatibleAttachment(Attachments.Laser, () -> {
                    GL11.glTranslatef(-0.25F, -0.9F, -4F);
                    GL11.glScaled(0.8F, 0.8F, 0.8F);
                    GL11.glRotatef(180F, 0f, 0f, 1f);
                })
                .withCompatibleAttachment(Attachments.Silencer556x45, (model) -> {
                    GL11.glTranslatef(-0.2F, -1.18F, -7F);
                    GL11.glScaled(1F, 1F, 1F);
                })
                .withTextureNames("scarl")
                .withRenderer(new WeaponRenderer.Builder()
                        .withModel(new ScarL())
                        .withActionPiece(AuxiliaryAttachments.ScarAction)
                        .withActionTransform(new Transform().withPosition(0, 0, 1.3F))
                        .withEntityPositioning(itemStack -> {
                            GL11.glScaled(0.5F, 0.5F, 0.5F);
                            GL11.glTranslatef(0, 0f, 3f);
                        })
                        .withInventoryPositioning(itemStack -> {
                            GL11.glScaled(0.35F, 0.35F, 0.35F);
                            GL11.glTranslatef(1, 2f, -1.2f);
                            GL11.glRotatef(-120F, -0.5f, 7f, 3f);
                        })
                        .withThirdPersonPositioning((renderContext) -> {
                            GL11.glScaled(0.5F, 0.5F, 0.5F);
                            GL11.glTranslatef(-2F, -1.2F, 2.2F);
                            GL11.glRotatef(-45F, 0f, 1f, 0f);
                            GL11.glRotatef(70F, 1f, 0f, 0f);
                        })

                        .withFirstPersonPositioning(
                                new Transform()
                                        .withPosition(-1.265000f, 4.625000f, -3.765000f)
                                        .withRotation(0.000000f, 1.000000f, 6.300000f)
                                        .withPivotPoint(-0.350000f, -2.900000f, -0.100000f)
                                        .withScale(3.0F, 3.0F, 3.0F)
                        )

                        .withFirstPersonHandPositioning(


                                new Transform()
                                        .withPosition(1.050000f, 0.065000f, -0.500000f)
                                        .withBBRotation(-8.1997F, -23.6991F, 57.7232F)
                                        .withScale(2.6F, 2.6F, 4.0F)
                                        .withPivotPoint(0, 0, 0),


                                new Transform()
                                        .withPosition(-0.2F, 0.1F, 2)
                                        .withRotation(-5.4027F, -4.7805F, -1.6694F)
                                        .withScale(3.5F, 3.5F, 3.5F)
                                        .withPivotPoint(0, 0, 0)

                        )

                        .setupModernAnimations("scar", AuxiliaryAttachments.ScarAction)
                        .setupModernMagazineAnimations("scar",
                                Magazines.M4A1Mag,
                                Magazines.M38Mag,
                                Magazines.Stanag100,
                                Magazines.Stanag50,
                                Magazines.Stanag60,
                                Magazines.SOCOM_Mag)

                        .withFirstPersonCustomPositioning(AuxiliaryAttachments.ScarAction.getRenderablePart(), (renderContext) -> {
                            if (renderContext.getWeaponInstance().getAmmo() == 0) {
                                GL11.glTranslatef(0F, 0F, 1.3F);
                            }
                        })

                        .withThirdPersonPositioningReloading(
                                new Transition((renderContext) -> {
                                    GL11.glScaled(0.6F, 0.6F, 0.6F);
                                    GL11.glTranslatef(-2F, -0.8F, 2.3F);
                                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                                    GL11.glRotatef(90F, 1f, 0f, 0f);
                                }, 180, 200),
                                new Transition((renderContext) -> {
                                    GL11.glScaled(0.6F, 0.6F, 0.6F);
                                    GL11.glTranslatef(-2F, -0.8F, 2.3F);
                                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                                    GL11.glRotatef(90F, 1f, 0f, 0f);
                                }, 240, 50),
                                new Transition((renderContext) -> {
                                    GL11.glScaled(0.6F, 0.6F, 0.6F);
                                    GL11.glTranslatef(-2F, -0.8F, 2.3F);
                                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                                    GL11.glRotatef(90F, 1f, 0f, 0f);
                                }, 170, 0),
                                new Transition((renderContext) -> {
                                    GL11.glScaled(0.6F, 0.6F, 0.6F);
                                    GL11.glTranslatef(-2F, -0.8F, 2.3F);
                                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                                    GL11.glRotatef(90F, 1f, 0f, 0f);
                                }, 170, 0),
                                new Transition((renderContext) -> {
                                    GL11.glScaled(0.6F, 0.6F, 0.6F);
                                    GL11.glTranslatef(-2F, -0.8F, 2.3F);
                                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                                    GL11.glRotatef(90F, 1f, 0f, 0f);
                                }, 260, 0),

                                new Transition((renderContext) -> {
                                    GL11.glScaled(0.6F, 0.6F, 0.6F);
                                    GL11.glTranslatef(-2F, -0.8F, 2.3F);
                                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                                    GL11.glRotatef(90F, 1f, 0f, 0f);
                                }, 240, 100),

                                new Transition((renderContext) -> {
                                    GL11.glScaled(0.6F, 0.6F, 0.6F);
                                    GL11.glTranslatef(-2F, -0.8F, 2.3F);
                                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                                    GL11.glRotatef(90F, 1f, 0f, 0f);
                                }, 200, 0),
                                new Transition((renderContext) -> {
                                    GL11.glScaled(0.6F, 0.6F, 0.6F);
                                    GL11.glTranslatef(-2F, -0.8F, 2.3F);
                                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                                    GL11.glRotatef(90F, 1f, 0f, 0f);
                                }, 170, 170),
                                new Transition((renderContext) -> {
                                    GL11.glScaled(0.6F, 0.6F, 0.6F);
                                    GL11.glTranslatef(-2F, -0.8F, 2.3F);
                                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                                    GL11.glRotatef(90F, 1f, 0f, 0f);
                                }, 260, 10),
                                new Transition((renderContext) -> {
                                    GL11.glScaled(0.6F, 0.6F, 0.6F);
                                    GL11.glTranslatef(-2F, -0.8F, 2.3F);
                                    GL11.glRotatef(-45F, 0f, 1f, 0f);
                                    GL11.glRotatef(90F, 1f, 0f, 0f);
                                }, 100, 50)
                        )

                        .withFirstPersonPositioningZooming((renderContext) -> {
                            GL11.glTranslatef(0.179F, 0.217F, 0.3F);

                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider))
                                GL11.glTranslatef(0F, -0.01f, 0.55f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG))
                                GL11.glTranslatef(-0.003F, 0.053f, 0.7f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter))
                                GL11.glTranslatef(-0.005F, -0.04f, 0.95f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.LeupoldRailScope))
                                GL11.glTranslatef(-0.002F, -0.02f, 0.65f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex))
                                GL11.glTranslatef(0F, -0.03f, 0.4f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex))
                                GL11.glTranslatef(0F, -0.005f, 0.4f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex))
                                GL11.glTranslatef(0F, -0.035f, 0.4f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra))
                                GL11.glTranslatef(0F, 0.01f, 0.4f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3))
                                GL11.glTranslatef(0F, 0.01f, 0.4f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1))
                                GL11.glTranslatef(0F, 0.02f, 0.6f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5))
                                GL11.glTranslatef(0F, 0.02f, 0.6f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM2))
                                GL11.glTranslatef(0F, -0.02f, 0.6f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux))
                                GL11.glTranslatef(0F, 0.044f, 0.4f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt))
                                GL11.glTranslatef(0F, 0.032f, 0.4f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic))
                                GL11.glTranslatef(0F, 0.032f, 0.4f);
                            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2))
                                GL11.glTranslatef(0F, 0.05f, 0.35f);
                        })

                        .withFirstPersonPositioningModifying((renderContext) -> {
                            new Transform()
                                    .withPosition(-1.985000f, 5.145000f, -5.245000f)
                                    .withRotation(0.000000f, -30.514396f, -26.062789f)
                                    .withPivotPoint(-0.350000f, -2.900000f, -0.100000f)
                                    .withScale(3.000000f, 3.000000f, 3.000000f)
                                    .applyTransformations();
                        })
                        .withFirstPersonPositioningModifyingAlt((renderContext) -> {
                            new Transform()
                                    .withPosition(-1.265000f, 4.745000f, -8.285000f)
                                    .withRotation(2.793742f, -46.352252f, -19.231070f)
                                    .withPivotPoint(-0.350000f, -2.900000f, -0.100000f)
                                    .withScale(3.000000f, 3.000000f, 3.000000f)
                                    .applyTransformations();
                        })

                        .withFirstPersonHandPositioningModifying(
                                (renderContext) -> {
                                    new Transform()
                                            .withPosition(2.330000f, 0.065000f, 0.140000f)
                                            .withRotation(78.544055f, 23.699100f, 18.430633f)
                                            .withScale(2.6F, 2.6F, 4.0F)
                                            .withPivotPoint(0.000000f, 0.000000f, 0.000000f)
                                            .applyTransformations();
                                },
                                (renderContext) -> {
                                    new Transform()
                                            .withPosition(-0.2F, 0.1F, 2)
                                            .withRotation(-5.4027F, -4.7805F, -1.6694F)
                                            .withScale(3.5F, 3.5F, 3.5F)
                                            .withPivotPoint(0, 0, 0)
                                            .applyTransformations();
                                })

                        .withFirstPersonHandPositioningModifyingAlt(
                                (renderContext) -> {
                                    new Transform()
                                            .withPosition(2.330000f, 0.065000f, 0.140000f)
                                            .withRotation(78.544055f, 23.699100f, 18.430633f)
                                            .withScale(2.600000f, 2.600000f, 4.000000f)
                                            .withPivotPoint(0.000000f, 0.000000f, 0.000000f)
                                            .applyTransformations();
                                },
                                (renderContext) -> {
                                    new Transform()
                                            .withPosition(-0.600000f, 0.340000f, 1.880000f)
                                            .withRotation(-12.193518f, -4.7805F, 1.399459f)
                                            .withScale(3.5F, 3.5F, 3.5F)
                                            .withPivotPoint(0.000000f, 0.000000f, 0.000000f)
                                            .applyTransformations();
                                })

                        .withThirdPersonLeftHandPositioningReloading(
                                new Transition((renderContext) -> {
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.000000f, -0.075000f, 0.075000f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.000000f, -0.025000f, 0.125000f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(-0.025000f, -0.075000f, 0.000000f);
                                }, 250, 50),
                                new Transition((renderContext) -> {
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(-0.025000f, -0.075000f, 0.000000f);
                                }, 250, 50),
                                new Transition((renderContext) -> {
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-15.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(-0.025000f, -0.075000f, 0.000000f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.000000f, -0.025000f, 0.125000f);
                                }, 250, 50),
                                new Transition((renderContext) -> {
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-45.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.000000f, -0.025000f, 0.125000f);
                                }, 250, 50),
                                new Transition((renderContext) -> {
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(30.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.000000f, -0.025000f, 0.125000f);
                                }, 250, 0),
                                new Transition((renderContext) -> {
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(15.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(-0.050000f, -0.025000f, 0.000000f);
                                }, 250, 0),
                                new Transition((renderContext) -> {
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-60.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(-20.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(25.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(-0.050000f, -0.025000f, 0.000000f);
                                }, 250, 0))

                        .withThirdPersonRightHandPositioningReloading(
                                new Transition((renderContext) -> {
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-95.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(-60.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.325000f, -0.150000f, 0.375000f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(-26.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(2.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(-26.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 50),
                                new Transition((renderContext) -> {
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(1.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 50),
                                new Transition((renderContext) -> {
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-53.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 1000),
                                new Transition((renderContext) -> {
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-53.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 50),
                                new Transition((renderContext) -> {
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-54.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(-25.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 50),
                                new Transition((renderContext) -> {
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(1.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(-24.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 0),
                                new Transition((renderContext) -> {
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(0.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(-24.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 0),
                                new Transition((renderContext) -> {
                                    GL11.glScalef(1.000000f, 1.000000f, 1.000000f);
                                    GL11.glRotatef(-55.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(2.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(-26.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.000000f, -0.150000f, 0.075000f);
                                }, 250, 0))

                        .build())
                .withSpawnEntityDamage(6f)
                .withSpawnEntityGravityVelocity(0.0118f)


                .build(MWC.modContext);
    }
}